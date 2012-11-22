(ns sicp.section-1-1-2)

;; Ways of counting change
(defn count-change
  "(UKified) Given an amount in pence and an optional collection of coin values, returns the number of ways to make that amount using coins of the given values"
  ([amount] (count-change #{1 2 5 10 20 50 100 200}))
  ([amount values] (println {:amount amount :values values}) (cond (< amount 0) 0
                            (zero? amount) 1
                            (empty? values) 0
                            :else (+ (count-change amount (disj values (first values)))
                                     (count-change (- amount (first values)) values)))))

;;(count-change 100 #{1 5 10 25 50})

