package de.uka.ipd.sdq.dsexplore.helper;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.util.URI;

/**
 * Writes to files specified by {@link URI}. 
 * As {@link URI}s cannot be directly used to create {@link File}s, this class encapsulates 
 * working with {@link URI}s and {@link File}s to write to.  
 * @author Anne
 *
 */
class DSEFileWriter {
	
	private FileWriter fileWriter;

	public DSEFileWriter(URI fileURL) throws IOException{
		
		String fileName = getFilenameFor(fileURL);
		this.fileWriter = new FileWriter(fileName);
	}

	/**
	 * Converts a {@link URI} to a filename that can be read by {@link FileWriter} and {@link FileReader}.
	 * @param fileURL
	 * @param fileName
	 * @return
	 */
	public static String getFilenameFor(URI fileURL) {
		String fileName = "";
		
		// if this is a platform URL, first resolve it to an absolute path
		if (fileURL.isPlatform()) {
			try {
				URL solvedURL = FileLocator.resolve(new URL(fileURL.toString()));
				fileName =  solvedURL.getPath();
			} catch (Exception e) {
				e.printStackTrace();
			} 
		} else if (fileURL.isFile()) {
			fileName = fileURL.toFileString();
		} else {
			// just try with toString, but will likely fail
			Logger logger = Logger.getLogger("de.uka.ipd.sdq.dsexplore.helper.DSEFileWriter");
			logger.warn("trying to write to or read from file with " + fileURL + " but this is neither a file URI not a platform URI. I will try anyway.");
			fileName = fileURL.toString();
		}
		return fileName;
	}

	/** @see {@link FileWriter}.write()  */
	public void write(String string) throws IOException {
		this.fileWriter.write(string);
	}
	
	/** @see {@link FileWriter}.close()  */
	public void close() throws IOException {
		this.fileWriter.close();
	}
	
	/** @see {@link FileWriter}.flush()  */
	public void flush() throws IOException{
		this.fileWriter.flush();
	}
	
	
	
	
}