
from my_parent_class import My_parent_class

from my_child_class import My_child_class



if __name__=="__main__":
    c=My_child_class(10,5)
    p=My_parent_class(20,5)
    c.add()
    c.sub()
    c.print_result()
    p.add()
    p.sub()
    p.print_result()