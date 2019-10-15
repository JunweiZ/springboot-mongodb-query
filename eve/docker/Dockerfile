FROM ubuntu:18.04
RUN apt update -y
RUN apt install -y vim curl python3-pip python-pip git
RUN pip3 --version;pip --version
RUN pip install virtualenv eve

# Install Eve - BEGIN
RUN git clone http://github.com/pyeve/eve.git
WORKDIR /eve
RUN virtualenv venv
RUN chmod +x ./venv/bin/activate;./venv/bin/activate
RUN python setup.py install
# Install Eve - END

# Copy my eve application configuration - BEGIN
COPY settings.py ./settings.py
COPY run.py ./run.py
# Copy my eve application configuration - END

EXPOSE 5000
ENTRYPOINT python run.py