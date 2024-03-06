
set1 = {1, 2, 3, 4, 5}
set2 = {4, 5, 6, 7, 8}

#set operations
union_set = set1.union(set2)  
intersection_set = set1.intersection(set2)  
difference_set = set1.difference(set2)  
symmetric_difference_set = set1.symmetric_difference(set2)  
subset_check = set1.issubset(set2)  
superset_check = set1.issuperset(set2)  

#validations
empty_check1 = len(set1) == 0  
empty_check2 = not set2  


print("Set 1:", set1)
print("Set 2:", set2)
print("Union:", union_set)
print("Intersection:", intersection_set)
print("Difference:", difference_set)
print("Symmetric Difference:", symmetric_difference_set)
print("Is Set 1 a subset of Set 2?", subset_check)
print("Is Set 1 a superset of Set 2?", superset_check)
print("Is Set 1 empty?", empty_check1)
print("Is Set 2 empty?", empty_check2)
