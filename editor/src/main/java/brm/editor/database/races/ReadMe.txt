  The FXML panels for defining and editing races in a game. This should allow defining various attributes of a database
race.

  A race object in the database allows defining the template images per individual's age category as well as gender. An
age category enumeration defines the various aging points in an individual's life-span, from the youngest to the oldest
(even though those most-common ages are in the middle of the age categories). The genders are male, female, and neuter;
but an additional "hermaphrodite" entry (which might not be used in most games) is included as well.

  The race also has attributes of which equippable equipments and items that can be slotted into various points for its
combat equipment. In XML definition, each "slot" is defined, along with which equippable objects can be put there. Then
in the Characters part of the database, we can automatically validate which initial starting equipment are included. An
equipment profile usually includes about three or four slots for wearable armors, and one slot for the held weapon, and
one slot for a held shield or defensive barrier. The XML structure might look like this:

    <equippable-slots>
      <equippable-slot index="0" location="headgear" types="" />
      <equippable-slot index="2" location="chest" types="" />
      <equippable-slot index="3" location="torso" types="" />
      <equippable-slot index="4" location="lower" types="" />
      <equippable-slot index="5" location="footwear" types="" />
      <equippable-slot index="6" location="handL" types="" />
      <equippable-slot index="7" location="handR" types="" />
    </equippable-slots>

  Then, in the Characters and Classes tabs of the database, they can each depend upon the race's equippable definitions
to control just which objects are selectable. (Classes further constrain which objects are relevant to that; Characters
also depend upon Classes, so in the end, a tightly-constrained automatically-validated list of equipment is maintained.
