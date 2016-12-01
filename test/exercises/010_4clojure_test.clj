(ns exercises.010-4clojure-test
  (:require [clojure.test :refer :all]))

(deftest exercise-test
  (testing
    (is (= 20 ((hash-map :a 10, :b 20, :c 30) :b))
        (= 20 (:b {:a 10, :b 20, :c 30})))))

;; https://www.4clojure.com/problem/10
;; Maps store key-value pairs. Both maps and keywords can be used as lookup
;; functions. Commas can be used to make maps more readable, but they are not
;; required.
