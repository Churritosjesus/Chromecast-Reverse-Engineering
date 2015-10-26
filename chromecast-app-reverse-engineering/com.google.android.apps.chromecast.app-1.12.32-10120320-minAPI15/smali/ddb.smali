.class public final Lddb;
.super Lder;
.source "PG"


# instance fields
.field private a:Ljava/lang/Long;

.field private b:Ljava/lang/Long;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 679
    invoke-direct {p0}, Lder;-><init>()V

    .line 680
    iput-object v0, p0, Lddb;->a:Ljava/lang/Long;

    .line 681
    iput-object v0, p0, Lddb;->b:Ljava/lang/Long;

    .line 682
    iput-object v0, p0, Lddb;->i:Ldes;

    .line 683
    const/4 v0, -0x1

    iput v0, p0, Lddb;->t:I

    .line 684
    return-void
.end method


# virtual methods
.method protected final a()I
    .locals 4

    .prologue
    .line 700
    invoke-super {p0}, Lder;->a()I

    move-result v0

    .line 701
    iget-object v1, p0, Lddb;->a:Ljava/lang/Long;

    if-eqz v1, :cond_0

    .line 702
    const/4 v1, 0x1

    iget-object v2, p0, Lddb;->a:Ljava/lang/Long;

    .line 703
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Ldep;->b(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 705
    :cond_0
    iget-object v1, p0, Lddb;->b:Ljava/lang/Long;

    if-eqz v1, :cond_1

    .line 706
    const/4 v1, 0x2

    iget-object v2, p0, Lddb;->b:Ljava/lang/Long;

    .line 707
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Ldep;->b(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 709
    :cond_1
    return v0
.end method

.method public final synthetic a(Ldeo;)Ldew;
    .locals 2

    .prologue
    .line 656
    .line 1717
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ldeo;->a()I

    move-result v0

    .line 1718
    sparse-switch v0, :sswitch_data_0

    .line 1722
    invoke-super {p0, p1, v0}, Lder;->a(Ldeo;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1723
    :sswitch_0
    return-object p0

    .line 1728
    :sswitch_1
    invoke-virtual {p1}, Ldeo;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lddb;->a:Ljava/lang/Long;

    goto :goto_0

    .line 1732
    :sswitch_2
    invoke-virtual {p1}, Ldeo;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lddb;->b:Ljava/lang/Long;

    goto :goto_0

    .line 1718
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
        0x10 -> :sswitch_2
    .end sparse-switch
.end method

.method public final a(Ldep;)V
    .locals 4

    .prologue
    .line 689
    iget-object v0, p0, Lddb;->a:Ljava/lang/Long;

    if-eqz v0, :cond_0

    .line 690
    const/4 v0, 0x1

    iget-object v1, p0, Lddb;->a:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p1, v0, v2, v3}, Ldep;->a(IJ)V

    .line 692
    :cond_0
    iget-object v0, p0, Lddb;->b:Ljava/lang/Long;

    if-eqz v0, :cond_1

    .line 693
    const/4 v0, 0x2

    iget-object v1, p0, Lddb;->b:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p1, v0, v2, v3}, Ldep;->a(IJ)V

    .line 695
    :cond_1
    invoke-super {p0, p1}, Lder;->a(Ldep;)V

    .line 696
    return-void
.end method
