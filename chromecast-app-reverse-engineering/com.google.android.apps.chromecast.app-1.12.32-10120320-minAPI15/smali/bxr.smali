.class final Lbxr;
.super Lbi;

# interfaces
.implements Lbwg;
.implements Lbwh;


# instance fields
.field public final e:Lcom/google/android/gms/common/api/GoogleApiClient;

.field f:Z

.field private g:Lcom/google/android/gms/common/ConnectionResult;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/common/api/GoogleApiClient;)V
    .locals 0

    invoke-direct {p0, p1}, Lbi;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lbxr;->e:Lcom/google/android/gms/common/api/GoogleApiClient;

    return-void
.end method

.method private b(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 1

    .prologue
    .line 0
    iput-object p1, p0, Lbxr;->g:Lcom/google/android/gms/common/ConnectionResult;

    .line 1158
    iget-boolean v0, p0, Lbi;->c:Z

    .line 0
    if-eqz v0, :cond_0

    .line 1167
    iget-boolean v0, p0, Lbi;->d:Z

    .line 0
    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lbxr;->a(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 0

    return-void
.end method

.method public final a(Landroid/os/Bundle;)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lbxr;->f:Z

    sget-object v0, Lcom/google/android/gms/common/ConnectionResult;->a:Lcom/google/android/gms/common/ConnectionResult;

    invoke-direct {p0, v0}, Lbxr;->b(Lcom/google/android/gms/common/ConnectionResult;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lbxr;->f:Z

    invoke-direct {p0, p1}, Lbxr;->b(Lcom/google/android/gms/common/ConnectionResult;)V

    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 1

    invoke-super {p0, p1, p2, p3, p4}, Lbi;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    iget-object v0, p0, Lbxr;->e:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    return-void
.end method

.method protected final b()V
    .locals 1

    invoke-super {p0}, Lbi;->b()V

    iget-object v0, p0, Lbxr;->e:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0, p0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lbwg;)V

    iget-object v0, p0, Lbxr;->e:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0, p0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lbwh;)V

    iget-object v0, p0, Lbxr;->g:Lcom/google/android/gms/common/ConnectionResult;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbxr;->g:Lcom/google/android/gms/common/ConnectionResult;

    invoke-virtual {p0, v0}, Lbxr;->a(Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lbxr;->e:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->d()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lbxr;->e:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->e()Z

    move-result v0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lbxr;->f:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lbxr;->e:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b()V

    :cond_1
    return-void
.end method

.method protected final d()V
    .locals 1

    iget-object v0, p0, Lbxr;->e:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->c()V

    return-void
.end method

.method protected final f()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lbxr;->g:Lcom/google/android/gms/common/ConnectionResult;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lbxr;->f:Z

    iget-object v0, p0, Lbxr;->e:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0, p0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lbwg;)V

    iget-object v0, p0, Lbxr;->e:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0, p0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lbwh;)V

    iget-object v0, p0, Lbxr;->e:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->c()V

    return-void
.end method
