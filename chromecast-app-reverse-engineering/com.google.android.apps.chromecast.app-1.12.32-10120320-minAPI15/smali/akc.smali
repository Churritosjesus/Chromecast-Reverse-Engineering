.class final Lakc;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lajo;


# instance fields
.field private synthetic a:Landroid/os/Bundle;

.field private synthetic b:Lakl;

.field private synthetic c:Laka;


# direct methods
.method constructor <init>(Laka;Landroid/os/Bundle;Lakl;)V
    .locals 0

    .prologue
    .line 142
    iput-object p1, p0, Lakc;->c:Laka;

    iput-object p2, p0, Lakc;->a:Landroid/os/Bundle;

    iput-object p3, p0, Lakc;->b:Lakl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lafq;)V
    .locals 4

    .prologue
    .line 159
    iget-object v0, p0, Lakc;->c:Laka;

    iget-object v0, v0, Laka;->b:Lakh;

    iget-object v1, p0, Lakc;->c:Laka;

    iget-object v1, v1, Laka;->b:Lakh;

    .line 2099
    iget-object v1, v1, Lakh;->f:Lakl;

    .line 160
    const-string v2, "Caught exception"

    .line 162
    invoke-virtual {p1}, Lafq;->getMessage()Ljava/lang/String;

    move-result-object v3

    .line 159
    invoke-static {v1, v2, v3}, Lakn;->a(Lakl;Ljava/lang/String;Ljava/lang/String;)Lakn;

    move-result-object v1

    invoke-virtual {v0, v1}, Lakh;->b(Lakn;)V

    .line 163
    return-void
.end method

.method public final a(Lorg/json/JSONObject;)V
    .locals 4

    .prologue
    .line 146
    :try_start_0
    const-string v0, "id"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 147
    iget-object v1, p0, Lakc;->a:Landroid/os/Bundle;

    const-string v2, "com.facebook.platform.extra.USER_ID"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    iget-object v0, p0, Lakc;->c:Laka;

    iget-object v1, p0, Lakc;->b:Lakl;

    iget-object v2, p0, Lakc;->a:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v2}, Laka;->b(Lakl;Landroid/os/Bundle;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 155
    :goto_0
    return-void

    .line 149
    :catch_0
    move-exception v0

    .line 150
    iget-object v1, p0, Lakc;->c:Laka;

    iget-object v1, v1, Laka;->b:Lakh;

    iget-object v2, p0, Lakc;->c:Laka;

    iget-object v2, v2, Laka;->b:Lakh;

    .line 1099
    iget-object v2, v2, Lakh;->f:Lakl;

    .line 151
    const-string v3, "Caught exception"

    .line 153
    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v0

    .line 150
    invoke-static {v2, v3, v0}, Lakn;->a(Lakl;Ljava/lang/String;Ljava/lang/String;)Lakn;

    move-result-object v0

    invoke-virtual {v1, v0}, Lakh;->b(Lakn;)V

    goto :goto_0
.end method
