.class final Lale;
.super Lajv;
.source "PG"


# instance fields
.field f:Ljava/lang/String;

.field g:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 226
    const-string v0, "oauth"

    invoke-direct {p0, p1, p2, v0, p3}, Lajv;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 227
    return-void
.end method


# virtual methods
.method public final a()Lajq;
    .locals 6

    .prologue
    .line 241
    .line 1629
    iget-object v3, p0, Lajv;->e:Landroid/os/Bundle;

    .line 242
    const-string v0, "redirect_uri"

    const-string v1, "fbconnect://success"

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 243
    const-string v0, "client_id"

    .line 2617
    iget-object v1, p0, Lajv;->b:Ljava/lang/String;

    .line 243
    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 244
    const-string v0, "e2e"

    iget-object v1, p0, Lale;->f:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 245
    const-string v0, "response_type"

    const-string v1, "token,signed_request"

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 248
    const-string v0, "return_scopes"

    const-string v1, "true"

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 253
    iget-boolean v0, p0, Lale;->g:Z

    if-eqz v0, :cond_0

    .line 254
    const-string v0, "auth_type"

    const-string v1, "rerequest"

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 259
    :cond_0
    new-instance v0, Lajq;

    .line 2621
    iget-object v1, p0, Lajv;->a:Landroid/content/Context;

    .line 259
    const-string v2, "oauth"

    .line 2625
    iget v4, p0, Lajv;->c:I

    .line 2633
    iget-object v5, p0, Lajv;->d:Lajx;

    .line 259
    invoke-direct/range {v0 .. v5}, Lajq;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;ILajx;)V

    return-object v0
.end method
