(ns exercises.018-4clojure-test
  (:require [clojure.test :refer :all]))

(deftest exercise-test
  (testing
    (is (= '(6 7) (filter #(> % 5) '(3 4 5 6 7))))))

;; https://www.4clojure.com/problem/18
;; The filter function takes two arguments: a predicate function (f) and a
;; sequence (s). Filter returns a new sequence consisting of all the items
;; of s for which (f item) returns true.
