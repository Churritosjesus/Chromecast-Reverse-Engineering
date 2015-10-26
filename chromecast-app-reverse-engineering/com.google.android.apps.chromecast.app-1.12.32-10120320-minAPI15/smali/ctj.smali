.class final Lctj;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Ljava/lang/String;

.field private synthetic b:Ljava/lang/String;

.field private synthetic c:Lctd;

.field private synthetic d:Lcth;


# direct methods
.method constructor <init>(Lcth;Ljava/lang/String;Ljava/lang/String;Lctd;)V
    .locals 0

    iput-object p1, p0, Lctj;->d:Lcth;

    iput-object p2, p0, Lctj;->a:Ljava/lang/String;

    iput-object p3, p0, Lctj;->b:Ljava/lang/String;

    iput-object p4, p0, Lctj;->c:Lctd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lctj;->d:Lcth;

    invoke-static {v0}, Lcth;->a(Lcth;)Ls;

    move-result-object v0

    invoke-interface {v0}, Ls;->d()Z

    move-result v0

    iget-object v1, p0, Lctj;->c:Lctd;

    invoke-interface {v1, v0}, Lctd;->a(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "SignInClientImpl"

    const-string v2, "RemoteException thrown when processing uploadServerAuthCode callback"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method
