.class public final Ladb;
.super Landroid/text/style/ReplacementSpan;
.source "PG"

# interfaces
.implements Lada;


# instance fields
.field private final a:Ladd;


# direct methods
.method public constructor <init>(Lacx;)V
    .locals 1

    .prologue
    .line 34
    invoke-direct {p0}, Landroid/text/style/ReplacementSpan;-><init>()V

    .line 36
    new-instance v0, Ladd;

    invoke-direct {v0, p1}, Ladd;-><init>(Lacx;)V

    iput-object v0, p0, Ladb;->a:Ladd;

    .line 37
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Ladb;->a:Ladd;

    invoke-virtual {v0, p1}, Ladd;->a(Ljava/lang/String;)V

    .line 87
    return-void
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Ladb;->a:Ladd;

    .line 1059
    const/4 v0, 0x0

    .line 46
    return v0
.end method

.method public final b()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Ladb;->a:Ladd;

    .line 1069
    iget-object v0, v0, Ladd;->a:Ljava/lang/CharSequence;

    .line 56
    return-object v0
.end method

.method public final c()J
    .locals 2

    .prologue
    .line 61
    iget-object v0, p0, Ladb;->a:Ladd;

    .line 1074
    iget-wide v0, v0, Ladd;->b:J

    .line 61
    return-wide v0
.end method

.method public final d()Ljava/lang/Long;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Ladb;->a:Ladd;

    .line 1079
    iget-object v0, v0, Ladd;->c:Ljava/lang/Long;

    .line 66
    return-object v0
.end method

.method public final draw(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V
    .locals 0

    .prologue
    .line 98
    return-void
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Ladb;->a:Ladd;

    .line 1084
    iget-object v0, v0, Ladd;->d:Ljava/lang/String;

    .line 71
    return-object v0
.end method

.method public final f()J
    .locals 2

    .prologue
    .line 76
    iget-object v0, p0, Ladb;->a:Ladd;

    .line 1089
    iget-wide v0, v0, Ladd;->e:J

    .line 76
    return-wide v0
.end method

.method public final g()Lacx;
    .locals 1

    .prologue
    .line 81
    iget-object v0, p0, Ladb;->a:Ladd;

    .line 1094
    iget-object v0, v0, Ladd;->f:Lacx;

    .line 81
    return-object v0
.end method

.method public final getSize(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I
    .locals 1

    .prologue
    .line 103
    const/4 v0, 0x0

    return v0
.end method

.method public final h()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Ladb;->a:Ladd;

    invoke-virtual {v0}, Ladd;->h()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final i()Landroid/graphics/Rect;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 108
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0, v1, v1, v1, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v0
.end method
