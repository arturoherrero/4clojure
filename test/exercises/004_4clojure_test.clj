(ns exercises.004-4clojure-test
  (:require [clojure.test :refer :all]))

(deftest exercise-test
  (testing
    (is (= (list :a :b :c) '(:a :b :c)))))

;; https://www.4clojure.com/problem/4
;; Lists can be constructed with either a function or a quoted form.
