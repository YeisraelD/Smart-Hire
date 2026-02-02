Smart Resume Analyzer
> From a CRUD to decision support system.

Smart Hire is a JavaFX-based application created to make resume screening simpler, fairer, and more meaningful. Instead of relying on basic keyword matching, the system uses a pre-trained AI model to understand resumes in context and evaluate how well a candidate aligns with a job description.

Smart Hire explores how AI-assisted tools can support recruiters by providing clear insights, while still leaving the final decision to humans.

What the System Does

Reads resumes in PDF and DOCX formats
Analyzes resumes using a pre-trained NLP model
Compares resumes with job descriptions semantically
Calculates a candidate relevance score
Highlights matched and missing skills
Presents results in a clean, interactive JavaFX interface


### Intelligence Behind the System

At the core of Smart Hire is a pre-trained Natural Language Processing (NLP) model used to extract meaning from text rather than just matching keywords.
[sentence-transformers/all-MiniLM-L6-v2](https://huggingface.co/sentence-transformers/all-MiniLM-L6-v2) hosted on Hugging Face.

Why this model? I chose the all-MiniLM-L6-v2 for its perfect balance of speed and intelligence. It is a "mini" model, meaning it is incredibly fast for real-time applications like a JavaFX dashboard, yet it is trained on over 1 billion sentence pairs to ensure it understands professional context deeply.

#### Model Specifications:
- Dimensions: 384 (providing a rich mathematical "fingerprint" of each resume)
- Max Sequence Length: 256 tokens (ideal for concise resume bullet points)
- Input: Raw text from PDF/DOCX
- Output: Dense vector space for high-speed cosine similarity comparison

#### This allows the system to:

- Recognize related skills and concepts
- Understand context within resumes
- Provide more realistic and useful evaluations

This is what makes Smart Hire an intelligent system, not a traditional rule-based application.

### Design & Architecture

The project follows a Model–View–Controller (MVC) structure:

- Model – Represents resume data and analysis results
- View – JavaFX UI built with FXML and Scene Builder
- Controller – Handles user actions and system logic
- This separation keeps the code organized, readable, and easy to extend.

### Object-Oriented Principles Applied

Smart Hire was intentionally designed to demonstrate core OOP concepts:

- Classes and Objects
- Encapsulation
- Inheritance
- Polymorphism
- Abstraction
- Exception Handling
These principles are applied throughout the system to ensure maintainability and clarity.

### Possible Future Improvements

- Persisting candidate data using a database
- Supporting more document formats
- Adding recruiter-specific dashboards
- Improving AI scoring explanations
- Exporting analysis results

#### Final Thoughts

Smart Hire is an exploration of how software engineering principles and AI tools can be combined to solve a real world problem.
The project emphasizes understanding, usability, and thoughtful design over unnecessary complexity.


HackTM C++ library

This library implements the Cortical Learning Algorithm as described
by Numenta's paper[1] in C++. It is meant to be a framework to
experiment with HTMs and the algorithm itself. 

This library works using bitmaps for input and output, and it is able
to associate these bitmaps to a generic, n-dimensional space.

No aggressive optimizations have been pursued, memory usage is not
optimal but it is fast enough and it is designed to be easily
pipelined by parallel threads.

To ease portability, it only uses STL library, with the exception of
LLVM BitVector class, included in the tree.


COMPILATION INSTRUCTIONS:

You will need cmake (http://www.cmake.org) to generate makefiles.
When you have installed cmake in your system, create a build
directory, cd into it and type:

 $ cmake /path/to/sources/

where "/path/to/sources/" is the place where the source have been
installed. If successful, you can type "make" and have the library and
tests compiled.


DIFFERENCES BETWEEN NUMENTA'S ALGORITHM AND HACKTM:

1. Boosting has not been implemented. There's no technical problem
behind implementing it, just lack of interest at this moment.
2. Sequence segments and prediction segments are treated
separately. This helps the sequential learner to better differentiate
between sequences with the same elements but in different order.


IMPORTANT NOTES ABOUT THE USE OF THIS SOFTWARE AND THE CLA ALGORITHM

This software is inteded for personal use and research only. Numenta
owns the Intellectual Property of the HTM algorithm. Please refer to
Numenta website for more information.

Also note that I am not affiliated at all with such company, and that
this library is the result of programming in my free time.


[1] http://numenta.com/htm-overview/education/HTM_CorticalLearningAlgorithms.pdf
