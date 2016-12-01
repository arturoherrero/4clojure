(ns exercises.019-4clojure-test
  (:require [clojure.test :refer :all]))

(deftest exercise-test
  (testing
    (is (= (#(first (reverse %)) [1 2 3 4 5]) 5))
    (is (= (#(first (reverse %)) '(5 4 3)) 3))
    (is (= (#(first (reverse %)) ["b" "c" "d"]) "d"))))

;; https://www.4clojure.com/problem/19
;; Write a function which returns the last element in a sequence.
