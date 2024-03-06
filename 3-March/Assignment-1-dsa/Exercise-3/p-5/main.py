from min_len_error import MinLengthError


try:
    mylist: list[int] = list(map(int, input('Enter space saparated integers:\n').split()))
    if len(mylist) < 5:
        raise MinLengthError()
except MinLengthError:
    print("minimum length of list should be 5")