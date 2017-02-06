(ns exercises.025-4clojure-test
  (:require [clojure.test :refer :all]))

(defn odd [collection]
  (filter odd? collection))

(deftest exercise-test
  (testing
    (is (= (odd #{1 2 3 4 5}) '(1 3 5)))
    (is (= (odd [4 2 1 6]) '(1)))
    (is (= (odd [2 2 4 6]) '()))
    (is (= (odd [1 1 1 3]) '(1 1 1 3)))))

;; https://www.4clojure.com/problem/25
;; Write a function which returns only the odd numbers from a sequence.
