(ns places.core)

;; todo maybe implement this as a protocol that must achieve certain things
;; could do a new york room mates and new york solo
(def new-york
  {:sleep 6
   :co-working 10
   :friends 10
   :car-needed false
   :skiing false
   :health 6
   ;; further break down into nutrition and sleep
   :tz-favorable true})









;; additional factors
;; proximity to health care
;; ability to evolve




(def boston
  {:sleep 10
   :co-working 4
   :friends 3
   :car-needed true
   :skiing true
   :health 5
   :tz-favorable true})

(def wyoming
  {:sleep 10
   :co-working 4
   :friends 3
   :car-needed true
   :skiing true
   :health 10
   :tz-favorable false})

(def connecticut
  {:sleep 5
   :co-working 0
   :friends 2
   :car-needed true
   :skiing false
   :health 8
   :tz-favorable true})


(defn tz-adjust
  "adjust the community score based on whether location is favorable for communicating with europe"
  [community-score tz-favorable])

(defn community [co-working friends tz-favorable]
  (let [community-average (/ (+ co-working friends) 2)]
    community-average))

;; (community 4 12)

