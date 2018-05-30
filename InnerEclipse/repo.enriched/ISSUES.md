# Issues
All known issues are presented here.

## OPEN
1. The repository is not imported but instead "copied" over. This probably shoudl be done differently!

## FIXED
Fixed issue, most preferably with a small explanation for future reference.
1. Exception in Problem 1
    * FIX: not Importing the Diagram and creating an own BasicComponent Container (that only has the Annotation stuff).
      * New Problem: How to properly attach to the corresponding BasicComponent of the "old" diagram
      * FIX: Roll back prior fix and try another way so we can still import the original Container
1. Exceptions when using Diagram Import because a function can not be resolved. See in ERROR.txt->Error 1
    * FIX: Copy/implement again the Container around the variable usage, then the exception disappears.
1. When getting the StereotypeApplication (with `[self.getStereotypeApplication()]`) in the `AppliedStereotype Annotation Node` the return type is a `emfprofileapplication.StereotypeApplication` and not an Annotation or AnnotationEnrich. This is why it is currently modelled as StereotypeApplication and not as an Annotation. This gets us the Problem with assigning the correct name, because the Tags field is missing (afaik).
    * FIX: we go over the StereotypeApplication with `[self.eGet('tags')]` to get the List of Tags. Then we can get the name(s).
1. Currently we assume that the tags field only has one Annotation. This way we can easily go and just grab the name of the first Annotation for the label. TODO: make a proper list
    * FIX: make the StereotypeApplication a Container and go over the tags (`[self.eGet('tags')]`) to make a real Annotation Node.

