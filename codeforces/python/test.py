def strongPasswordChecker(password):
    if len(password) > 20:
        print("Error! Please retype!")
        return
    if (len(password) < 20):
        temp = 0
        if any('a' <= c <= 'z' for c in password):
            temp += 1
        if any('A' <= c <= 'Z' for c in password):
            temp += 1
        if any(c.isdigit() for c in password):
            temp += 1
        if any(c in ['$', '#', '@'] for c in password):
            temp += 1

        if len(password) <= 16 and len(password) >= 6 and temp == 4:
            print("YES")

        else:
            print("NO")


strongPasswordChecker(input())
