(ns places.places)

(defn health
  "construct a map of health attributes"
  [sleep nutrition exercise proximity-to-care]
  {:sleep sleep
   :nutrition nutrition
   :exercise exercise
   :proximity-to-care proximity-to-care})


(defn community
  "consturct a map of community attributes")



(defn place-maker
  "given attributes, construct a map about a place"
  [health co-working friends car-needed skiing health tz-favorable])
