(ns sicp.section-1-1-6)

(defn abs [x]
  (cond (> x 0) x
        (zero? x) 0
        (< x 0) (- x)))

(defn abs2 [x] ()
  (cond (< x 0) (- x)
        :else x))

(defn abs-if [x]
  (if (< x 0)
    (- x)
    x))

(def x 6)
(and (> x 5) (< x 10))

;; Literal translation, easier of course to use native >=
;; changed function name to avoid replacing core version.
(defn gte [x y]
  (or (> x y) (= x y)))

(defn gte2 [x y]
  (not (< x y)))

;; Clojure also offers the possibility of using complement
(def gte3 (complement <))