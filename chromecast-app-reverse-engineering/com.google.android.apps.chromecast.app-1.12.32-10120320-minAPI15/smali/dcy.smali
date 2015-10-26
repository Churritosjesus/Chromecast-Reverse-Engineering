.class public final Ldcy;
.super Lder;
.source "PG"


# instance fields
.field private a:Ljava/lang/Long;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 919
    invoke-direct {p0}, Lder;-><init>()V

    .line 920
    iput-object v0, p0, Ldcy;->a:Ljava/lang/Long;

    .line 921
    iput-object v0, p0, Ldcy;->i:Ldes;

    .line 922
    const/4 v0, -0x1

    iput v0, p0, Ldcy;->t:I

    .line 923
    return-void
.end method


# virtual methods
.method protected final a()I
    .locals 4

    .prologue
    .line 936
    invoke-super {p0}, Lder;->a()I

    move-result v0

    .line 937
    iget-object v1, p0, Ldcy;->a:Ljava/lang/Long;

    if-eqz v1, :cond_0

    .line 938
    const/4 v1, 0x1

    iget-object v2, p0, Ldcy;->a:Ljava/lang/Long;

    .line 939
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Ldep;->b(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 941
    :cond_0
    return v0
.end method

.method public final synthetic a(Ldeo;)Ldew;
    .locals 2

    .prologue
    .line 899
    .line 1949
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ldeo;->a()I

    move-result v0

    .line 1950
    sparse-switch v0, :sswitch_data_0

    .line 1954
    invoke-super {p0, p1, v0}, Lder;->a(Ldeo;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1955
    :sswitch_0
    return-object p0

    .line 1960
    :sswitch_1
    invoke-virtual {p1}, Ldeo;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Ldcy;->a:Ljava/lang/Long;

    goto :goto_0

    .line 1950
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
    .end sparse-switch
.end method

.method public final a(Ldep;)V
    .locals 4

    .prologue
    .line 928
    iget-object v0, p0, Ldcy;->a:Ljava/lang/Long;

    if-eqz v0, :cond_0

    .line 929
    const/4 v0, 0x1

    iget-object v1, p0, Ldcy;->a:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p1, v0, v2, v3}, Ldep;->a(IJ)V

    .line 931
    :cond_0
    invoke-super {p0, p1}, Lder;->a(Ldep;)V

    .line 932
    return-void
.end method
