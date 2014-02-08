#@author Deano24
#@desc Python Script to test run time of python

#timer to be imported
import timeit

#function that counts to 100,000
def count_func():
	x=0
	while(x<100000):
		x+=1
	return -1

#runs a timeit object on the count_func and prints its run time in seconds
print(timeit.timeit(count_func,number=1))

#function that reads file line by line and writes to a next file
# def file_func():
# 	f = open('C:\\Users\\Deano\\Documents\\test\\dummy.txt')
# 	o = open('C:\\Users\\Deano\\Documents\\test\\Pdummy.txt','w')
# 	for line in f:
# 		o.write(line)
#     	o.write('\n')
# 	f.close()
# 	o.close()
# 	return -1

# #runs a timeit object on the file_func and puts the time in a variable to be stored
# number = timeit.timeit(file_func,number=1)

# #opens a file writes the variable to the file and closes the file
# r = open('C:\\Users\\Deano\\Documents\\test\\response.txt','w')
# r.write('{}'.format(number))
# r.close