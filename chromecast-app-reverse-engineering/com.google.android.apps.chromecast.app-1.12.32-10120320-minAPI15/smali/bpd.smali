.class public Lbpd;
.super Lcow;


# instance fields
.field public final a:Lbrb;

.field public b:Z


# direct methods
.method public constructor <init>(Lbrb;)V
    .locals 2

    .prologue
    .line 0
    invoke-virtual {p1}, Lbrb;->b()Lcox;

    move-result-object v0

    .line 1000
    iget-object v1, p1, Lbrb;->c:Lcac;

    .line 0
    invoke-direct {p0, v0, v1}, Lcow;-><init>(Lcox;Lcac;)V

    iput-object p1, p0, Lbpd;->a:Lbrb;

    return-void
.end method


# virtual methods
.method public final a()Lcou;
    .locals 2

    .prologue
    .line 0
    .line 2000
    iget-object v0, p0, Lcow;->h:Lcou;

    .line 0
    invoke-virtual {v0}, Lcou;->a()Lcou;

    move-result-object v0

    iget-object v1, p0, Lbpd;->a:Lbrb;

    invoke-virtual {v1}, Lbrb;->h()Lbrm;

    move-result-object v1

    invoke-virtual {v1}, Lbrm;->b()Lcpe;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcou;->a(Lcov;)V

    iget-object v1, p0, Lbpd;->a:Lbrb;

    .line 3000
    iget-object v1, v1, Lbrb;->h:Lbsd;

    .line 0
    invoke-virtual {v1}, Lbsd;->b()Lcpg;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcou;->a(Lcov;)V

    invoke-virtual {p0, v0}, Lbpd;->b(Lcou;)V

    return-object v0
.end method

.method protected final a(Lcou;)V
    .locals 3

    .prologue
    .line 0
    const-class v0, Lbpy;

    invoke-virtual {p1, v0}, Lcou;->b(Ljava/lang/Class;)Lcov;

    move-result-object v0

    check-cast v0, Lbpy;

    .line 4000
    iget-object v1, v0, Lbpy;->b:Ljava/lang/String;

    .line 0
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lbpd;->a:Lbrb;

    invoke-virtual {v1}, Lbrb;->g()Lbrt;

    move-result-object v1

    invoke-virtual {v1}, Lbrt;->b()Ljava/lang/String;

    move-result-object v1

    .line 5000
    iput-object v1, v0, Lbpy;->b:Ljava/lang/String;

    .line 0
    :cond_0
    iget-boolean v1, p0, Lbpd;->b:Z

    if-eqz v1, :cond_1

    .line 6000
    iget-object v1, v0, Lbpy;->d:Ljava/lang/String;

    .line 0
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lbpd;->a:Lbrb;

    invoke-virtual {v1}, Lbrb;->f()Lbqf;

    move-result-object v1

    invoke-virtual {v1}, Lbqf;->c()Ljava/lang/String;

    move-result-object v2

    .line 7000
    iput-object v2, v0, Lbpy;->d:Ljava/lang/String;

    .line 0
    invoke-virtual {v1}, Lbqf;->b()Z

    move-result v1

    .line 8000
    iput-boolean v1, v0, Lbpy;->e:Z

    .line 0
    :cond_1
    return-void
.end method
