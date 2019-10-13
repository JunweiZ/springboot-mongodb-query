# Find 
db.spaceships.find({name: /^F/}).pretty()

db.spaceships.find({name: "Falcon"}).pretty()

db.spaceships.find({"cargo": {$exists: false}}).pretty()

# Insert
db.spaceships.insert({"name": "Flying sourcer", crew: 12, cargo: [{type: "hyperspace part", qty: 2123 },{type: "droids", qty: 2} ] })

# Update 
db.spaceships.update({"cargo": {$exists: false}}, {$set: {"cargo": [{type: "asteroids", qty: 24}, {type: "water", qty: 1000}]}}, {upsert: true, multi: true} )

# Drop collection
db.mycollection.drop()

# Delete
db.spaceships.deleteOne({_id: ObjectId("5da34b39e29fe02769d0886d")} )
