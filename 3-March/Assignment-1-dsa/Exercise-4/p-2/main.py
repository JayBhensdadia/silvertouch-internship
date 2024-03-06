def check_string_length(string):
    assert len(string) >= 10, "String length should be minimum 10 characters"


test_string = "abcdefghij"
check_string_length(test_string)  

test_string_short = "abc"
check_string_length(test_string_short)  
