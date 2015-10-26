.class public final Lade;
.super Ladc;
.source "PG"

# interfaces
.implements Lada;


# instance fields
.field private final c:Ladd;


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Drawable;Lacx;)V
    .locals 1

    .prologue
    .line 33
    invoke-direct {p0, p1}, Ladc;-><init>(Landroid/graphics/drawable/Drawable;)V

    .line 34
    new-instance v0, Ladd;

    invoke-direct {v0, p2}, Ladd;-><init>(Lacx;)V

    iput-object v0, p0, Lade;->c:Ladd;

    .line 35
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lade;->c:Ladd;

    invoke-virtual {v0, p1}, Ladd;->a(Ljava/lang/String;)V

    .line 85
    return-void
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lade;->c:Ladd;

    .line 1059
    const/4 v0, 0x0

    .line 44
    return v0
.end method

.method public final b()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lade;->c:Ladd;

    .line 1069
    iget-object v0, v0, Ladd;->a:Ljava/lang/CharSequence;

    .line 54
    return-object v0
.end method

.method public final c()J
    .locals 2

    .prologue
    .line 59
    iget-object v0, p0, Lade;->c:Ladd;

    .line 1074
    iget-wide v0, v0, Ladd;->b:J

    .line 59
    return-wide v0
.end method

.method public final d()Ljava/lang/Long;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lade;->c:Ladd;

    .line 1079
    iget-object v0, v0, Ladd;->c:Ljava/lang/Long;

    .line 64
    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Lade;->c:Ladd;

    .line 1084
    iget-object v0, v0, Ladd;->d:Ljava/lang/String;

    .line 69
    return-object v0
.end method

.method public final f()J
    .locals 2

    .prologue
    .line 74
    iget-object v0, p0, Lade;->c:Ladd;

    .line 1089
    iget-wide v0, v0, Ladd;->e:J

    .line 74
    return-wide v0
.end method

.method public final g()Lacx;
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Lade;->c:Ladd;

    .line 1094
    iget-object v0, v0, Ladd;->f:Lacx;

    .line 79
    return-object v0
.end method

.method public final h()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 89
    iget-object v0, p0, Lade;->c:Ladd;

    invoke-virtual {v0}, Ladd;->h()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final i()Landroid/graphics/Rect;
    .locals 1

    .prologue
    .line 94
    invoke-super {p0}, Ladc;->i()Landroid/graphics/Rect;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 104
    iget-object v0, p0, Lade;->c:Ladd;

    invoke-virtual {v0}, Ladd;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
