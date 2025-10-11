# Low-Level-System-Design

Most codes are from the book Head first design patterns
But I rewrote them for practice

## Iterator and Composite Patterns
- merging 3 restaurants. all use the same MenuItem Class. So that makes things a little easy. If not, need to modify the codebases to maintain decorum
- step 1 is a using custom iterator for both array list and arrays in pancakehouse and diner menu respectively
- step 2 is to use the inbuilt iterator for arraylist (pancakehouse) and custom iterator for array(diner menu)
- step 3 is to merge cafe restaurant
- step 4 (solely composite pattern) is to make changes to ensure we can have submenus inside menus classes. So, here, we shall Make every restaurant reimplement their Menu classes. So that we can accomodate future acquisitions and submenus. 
  - should be able to traverse in a tree like fashion in menus ans submenus.
  - need to traverse items in a more flexible manner. migh need to iterate over only he Diner's dessert menu, or we might need to iterate over the Diner's entire menu, includign the dessert submenu.


## State Pattern
