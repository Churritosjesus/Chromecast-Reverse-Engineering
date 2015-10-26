.class public final Ldbi;
.super Ldew;
.source "PG"


# instance fields
.field public a:Ldbb;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 26
    invoke-direct {p0}, Ldew;-><init>()V

    .line 27
    const/4 v0, 0x0

    iput-object v0, p0, Ldbi;->a:Ldbb;

    .line 28
    const/4 v0, -0x1

    iput v0, p0, Ldbi;->t:I

    .line 29
    return-void
.end method


# virtual methods
.method protected final a()I
    .locals 3

    .prologue
    .line 42
    invoke-super {p0}, Ldew;->a()I

    move-result v0

    .line 43
    iget-object v1, p0, Ldbi;->a:Ldbb;

    if-eqz v1, :cond_0

    .line 44
    const/4 v1, 0x1

    iget-object v2, p0, Ldbi;->a:Ldbb;

    .line 45
    invoke-static {v1, v2}, Ldep;->b(ILdew;)I

    move-result v1

    add-int/2addr v0, v1

    .line 47
    :cond_0
    return v0
.end method

.method public final synthetic a(Ldeo;)Ldew;
    .locals 1

    .prologue
    .line 5
    .line 1055
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ldeo;->a()I

    move-result v0

    .line 1056
    sparse-switch v0, :sswitch_data_0

    .line 1060
    invoke-static {p1, v0}, Ldey;->a(Ldeo;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1061
    :sswitch_0
    return-object p0

    .line 1066
    :sswitch_1
    iget-object v0, p0, Ldbi;->a:Ldbb;

    if-nez v0, :cond_1

    .line 1067
    new-instance v0, Ldbb;

    invoke-direct {v0}, Ldbb;-><init>()V

    iput-object v0, p0, Ldbi;->a:Ldbb;

    .line 1069
    :cond_1
    iget-object v0, p0, Ldbi;->a:Ldbb;

    invoke-virtual {p1, v0}, Ldeo;->a(Ldew;)V

    goto :goto_0

    .line 1056
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
    .end sparse-switch
.end method

.method public final a(Ldep;)V
    .locals 2

    .prologue
    .line 34
    iget-object v0, p0, Ldbi;->a:Ldbb;

    if-eqz v0, :cond_0

    .line 35
    const/4 v0, 0x1

    iget-object v1, p0, Ldbi;->a:Ldbb;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILdew;)V

    .line 37
    :cond_0
    invoke-super {p0, p1}, Ldew;->a(Ldep;)V

    .line 38
    return-void
.end method
