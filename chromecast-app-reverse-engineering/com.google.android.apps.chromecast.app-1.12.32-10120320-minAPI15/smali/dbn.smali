.class public final Ldbn;
.super Ldew;
.source "PG"


# instance fields
.field public a:Ldbj;

.field public b:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 29
    invoke-direct {p0}, Ldew;-><init>()V

    .line 30
    iput-object v0, p0, Ldbn;->a:Ldbj;

    .line 31
    iput-object v0, p0, Ldbn;->b:Ljava/lang/String;

    .line 32
    const/4 v0, -0x1

    iput v0, p0, Ldbn;->t:I

    .line 33
    return-void
.end method


# virtual methods
.method protected final a()I
    .locals 3

    .prologue
    .line 49
    invoke-super {p0}, Ldew;->a()I

    move-result v0

    .line 50
    iget-object v1, p0, Ldbn;->a:Ldbj;

    if-eqz v1, :cond_0

    .line 51
    const/4 v1, 0x1

    iget-object v2, p0, Ldbn;->a:Ldbj;

    .line 52
    invoke-static {v1, v2}, Ldep;->b(ILdew;)I

    move-result v1

    add-int/2addr v0, v1

    .line 54
    :cond_0
    iget-object v1, p0, Ldbn;->b:Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 55
    const/4 v1, 0x2

    iget-object v2, p0, Ldbn;->b:Ljava/lang/String;

    .line 56
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 58
    :cond_1
    return v0
.end method

.method public final synthetic a(Ldeo;)Ldew;
    .locals 1

    .prologue
    .line 5
    .line 1066
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ldeo;->a()I

    move-result v0

    .line 1067
    sparse-switch v0, :sswitch_data_0

    .line 1071
    invoke-static {p1, v0}, Ldey;->a(Ldeo;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1072
    :sswitch_0
    return-object p0

    .line 1077
    :sswitch_1
    iget-object v0, p0, Ldbn;->a:Ldbj;

    if-nez v0, :cond_1

    .line 1078
    new-instance v0, Ldbj;

    invoke-direct {v0}, Ldbj;-><init>()V

    iput-object v0, p0, Ldbn;->a:Ldbj;

    .line 1080
    :cond_1
    iget-object v0, p0, Ldbn;->a:Ldbj;

    invoke-virtual {p1, v0}, Ldeo;->a(Ldew;)V

    goto :goto_0

    .line 1084
    :sswitch_2
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldbn;->b:Ljava/lang/String;

    goto :goto_0

    .line 1067
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x12 -> :sswitch_2
    .end sparse-switch
.end method

.method public final a(Ldep;)V
    .locals 2

    .prologue
    .line 38
    iget-object v0, p0, Ldbn;->a:Ldbj;

    if-eqz v0, :cond_0

    .line 39
    const/4 v0, 0x1

    iget-object v1, p0, Ldbn;->a:Ldbj;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILdew;)V

    .line 41
    :cond_0
    iget-object v0, p0, Ldbn;->b:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 42
    const/4 v0, 0x2

    iget-object v1, p0, Ldbn;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 44
    :cond_1
    invoke-super {p0, p1}, Ldew;->a(Ldep;)V

    .line 45
    return-void
.end method
