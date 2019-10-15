DOMAIN = {
    'people': {
        'allow_unknown': True,
        'schema': {
            'firstname': {'type': 'string'},
        }
    }
    ,
    'spaceship': {
        'allow_unknown': True
    }
}

# Please note that MONGO_HOST and MONGO_PORT could very well be left
# out as they already default to a bare bones local 'mongod' instance.
MONGO_HOST = 'mongo'
MONGO_PORT = 27017

# Skip this block if your db has no auth. But it really should.
# MONGO_USERNAME = '<your username>'
# MONGO_PASSWORD = '<your password>'
# Name of the database on which the user can be authenticated,
# needed if --auth mode is enabled.
# MONGO_AUTH_SOURCE = '<dbname>'
MONGO_DBNAME = 'mytestdb'

# Enable reads (GET), inserts (POST) and DELETE for resources/collections
# (if you omit this line, the API will default to ['GET'] and provide
# read-only access to the endpoint).
RESOURCE_METHODS = ['GET', 'POST', 'DELETE']

# Enable reads (GET), edits (PATCH), replacements (PUT) and deletes of
# individual items  (defaults to read-only item access).
ITEM_METHODS = ['GET', 'PATCH', 'PUT', 'DELETE']
DEBUG = 'True'

SERVER_NAME = '0.0.0.0:5000'
