(ns exercises.027-4clojure-test
  (:require [clojure.test :refer :all]))

(defn palindrome? [collection]
  (= (seq collection) (reverse collection)))

(deftest exercise-test
  (testing
    (is (false? (palindrome? '(1 2 3 4 5))))
    (is (true?  (palindrome? "racecar")))
    (is (true?  (palindrome? [:foo :bar :foo])))
    (is (true?  (palindrome? '(1 1 3 3 1 1))))
    (is (false? (palindrome? '(:a :b :c))))))

;; https://www.4clojure.com/problem/27
;; Write a function which returns true if the given sequence is a palindrome.
