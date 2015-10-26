.class public final Lbrm;
.super Lbra;


# instance fields
.field private final a:Lcpe;


# direct methods
.method constructor <init>(Lbrb;)V
    .locals 1

    invoke-direct {p0, p1}, Lbra;-><init>(Lbrb;)V

    new-instance v0, Lcpe;

    invoke-direct {v0}, Lcpe;-><init>()V

    iput-object v0, p0, Lbrm;->a:Lcpe;

    return-void
.end method


# virtual methods
.method protected final a()V
    .locals 3

    .prologue
    .line 0
    .line 1000
    iget-object v0, p0, Lbqz;->d:Lbrb;

    invoke-virtual {v0}, Lbrb;->b()Lcox;

    move-result-object v0

    .line 0
    invoke-virtual {v0}, Lcox;->a()Lcpe;

    move-result-object v0

    iget-object v1, p0, Lbrm;->a:Lcpe;

    invoke-virtual {v0, v1}, Lcpe;->a(Lcpe;)V

    .line 3000
    iget-object v0, p0, Lbqz;->d:Lbrb;

    invoke-virtual {v0}, Lbrb;->e()Lbqt;

    move-result-object v0

    .line 2000
    invoke-virtual {v0}, Lbqt;->c()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v2, p0, Lbrm;->a:Lcpe;

    .line 4000
    iput-object v1, v2, Lcpe;->a:Ljava/lang/String;

    .line 2000
    :cond_0
    invoke-virtual {v0}, Lbqt;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lbrm;->a:Lcpe;

    .line 5000
    iput-object v0, v1, Lcpe;->b:Ljava/lang/String;

    .line 0
    :cond_1
    return-void
.end method

.method public final b()Lcpe;
    .locals 1

    invoke-virtual {p0}, Lbrm;->r()V

    iget-object v0, p0, Lbrm;->a:Lcpe;

    return-object v0
.end method
