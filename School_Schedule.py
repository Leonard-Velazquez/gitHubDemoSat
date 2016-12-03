#Leonard Velazquez
#School schedule 
ADD = 1
DELETE = 2
DISPLAY = 3
EXIT = 4

def main():
    file = ('School_Schedule.txt')
    end_of_file = False #indicate end of file
    choice = 0
    
    #Checks if file exists by the function.
    exists = file_Existence(file)
    


def file_Existence(filepath):
    try:
        f = open(filepath)
    except IOError: 
        return False

    return True
