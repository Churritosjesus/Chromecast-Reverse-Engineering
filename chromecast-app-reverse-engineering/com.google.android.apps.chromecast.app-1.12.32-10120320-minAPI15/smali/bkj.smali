.class final Lbkj;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbwn;


# instance fields
.field private synthetic a:Lbkh;


# direct methods
.method constructor <init>(Lbkh;)V
    .locals 0

    .prologue
    .line 185
    iput-object p1, p0, Lbkj;->a:Lbkh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lbwm;)V
    .locals 2

    .prologue
    .line 185
    check-cast p1, Lctn;

    .line 1188
    iget-object v0, p0, Lbkj;->a:Lbkh;

    .line 2020
    const/4 v1, 0x0

    iput-object v1, v0, Lbkh;->b:Lbwj;

    .line 1189
    invoke-virtual {p1}, Lctn;->b()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1191
    iget-object v0, p0, Lbkj;->a:Lbkh;

    .line 3020
    iget-object v0, v0, Lbkh;->a:Lbwj;

    .line 1191
    if-nez v0, :cond_0

    iget-object v0, p0, Lbkj;->a:Lbkh;

    .line 4020
    iget-object v0, v0, Lbkh;->e:Lbkk;

    .line 1191
    if-eqz v0, :cond_0

    .line 1192
    iget-object v0, p0, Lbkj;->a:Lbkh;

    .line 5020
    iget-object v0, v0, Lbkh;->e:Lbkk;

    .line 1192
    invoke-interface {v0}, Lbkk;->f()V

    .line 1194
    :cond_0
    :goto_0
    return-void

    .line 1197
    :cond_1
    iget-object v0, p0, Lbkj;->a:Lbkh;

    .line 6020
    iget-object v0, v0, Lbkh;->a:Lbwj;

    .line 1197
    if-nez v0, :cond_0

    .line 1198
    iget-object v0, p0, Lbkj;->a:Lbkh;

    .line 7020
    iget-object v0, v0, Lbkh;->e:Lbkk;

    .line 1198
    if-eqz v0, :cond_0

    .line 1199
    iget-object v0, p0, Lbkj;->a:Lbkh;

    .line 8020
    iget-object v0, v0, Lbkh;->e:Lbkk;

    .line 1199
    invoke-interface {v0}, Lbkk;->f()V

    goto :goto_0
.end method
