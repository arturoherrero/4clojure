(ns exercises.024-4clojure-test
  (:require [clojure.test :refer :all]))

(defn sum [collection]
  (reduce + collection))

(deftest exercise-test
  (testing
    (is (= (sum [1 2 3]) 6))
    (is (= (sum (list 0 -2 5 5)) 8))
    (is (= (sum #{4 2 1}) 7))
    (is (= (sum '(0 0 -1)) -1))
    (is (= (sum '(1 10 3)) 14))))

;; https://www.4clojure.com/problem/24
;; Write a function which returns the sum of a sequence of numbers.
