require 'mdb'
require 'pry'
file = 'Testing_Database.accdb'

database = Mdb.open(file)
# binding.pry

# list tables in the database
p database.tables 

# read the records in a table
# database[:Movies]