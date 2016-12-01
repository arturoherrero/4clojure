(ns exercises.021-4clojure-test
  (:require [clojure.test :refer :all]))

(defn my-nth
  [collection position]
   (if (zero? position)
     (first collection)
     (my-nth (rest collection) (- position 1))))

(deftest exercise-test
  (testing
    (is (= (my-nth '(4 5 6 7) 2) 6))
    (is (= (my-nth [:a :b :c] 0) :a))
    (is (= (my-nth [1 2 3 4] 1) 2))
    (is (= (my-nth '([1 2] [3 4] [5 6]) 2) [5 6]))))

;; https://www.4clojure.com/problem/21
;; Write a function which returns the Nth element from a sequence.
