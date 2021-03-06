import React, { useState } from "react"
import { connect, ConnectedProps } from "react-redux"
import { useHistory } from "react-router-dom"
import { PATH } from "src/constants/paths"
import { Title } from "./Login.styles"
import { login } from "./Login.thunks"

const mapStateToProps = state => ({
  loading: state.loading
})

const mapDispatchToProps = {
  login
}

const connector = connect(mapStateToProps, mapDispatchToProps)

interface Props extends ConnectedProps<typeof connector> {}

const Login = (props: Props) => {
  const { login, loading } = props
  const [username, setUsername] = useState("")
  const [password, setPassword] = useState("")
  const [error, setError] = useState("")
  const history = useHistory()
  const handleUsername = (event: React.ChangeEvent<HTMLInputElement>) => {
    setUsername(event.target.value)
  }

  const handlePassword = (event: React.ChangeEvent<HTMLInputElement>) => {
    setPassword(event.target.value)
  }

  const submit = async (event: React.FormEvent<HTMLFormElement>) => {
    event.preventDefault()
    if (!loading) {
      const payload = { username, password }
      login(payload)
        .then(res => {
          history.push(PATH.HOME)
        })
        .catch(err => {
          setError(err.payload.message)
        })
    }
  }

  return (
    <div className="container">
      <div className="min-vh-100 row">
        <div className="col-md-6 m-auto">
          <form className="p-5 rounded-sm shadow text-center" onSubmit={submit}>
            <Title>Đăng nhập</Title>
            <p className="text-muted">Nhập tài khoản và mật khẩu của bạn</p>
            <input
              type="text"
              name="user"
              id="username"
              tabIndex={1}
              autoFocus={true}
              placeholder="Tài khoản"
              onChange={handleUsername}
              className="form-control form-control-lg mb-4"
            />
            <input
              type="password"
              id="password"
              tabIndex={2}
              placeholder="Mật khẩu"
              onChange={handlePassword}
              className="form-control form-control-lg mb-4"
            />
            {error && (
              <div id="errorLogin" className="mb-3 text-danger text-xl-center">{error}</div>
            )}
            <button
            id="btnLogin"
              type="submit"
              tabIndex={3}
              className="btn btn-block btn-primary btn-lg"
            >
              Đăng nhập
            </button>
          </form>
        </div>
      </div>
    </div>
  )
}

export default connector(Login)
