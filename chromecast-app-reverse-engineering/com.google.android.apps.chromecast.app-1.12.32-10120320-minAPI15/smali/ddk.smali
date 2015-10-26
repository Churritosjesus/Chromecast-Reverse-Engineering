.class abstract Lddk;
.super Ljava/util/AbstractList;
.source "PG"

# interfaces
.implements Lddw;


# instance fields
.field a:Z


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 24
    const/4 v0, 0x1

    iput-boolean v0, p0, Lddk;->a:Z

    .line 25
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .prologue
    .line 59
    iget-boolean v0, p0, Lddk;->a:Z

    return v0
.end method

.method public add(ILjava/lang/Object;)V
    .locals 0

    .prologue
    .line 35
    invoke-virtual {p0}, Lddk;->c()V

    .line 36
    invoke-super {p0, p1, p2}, Ljava/util/AbstractList;->add(ILjava/lang/Object;)V

    .line 37
    return-void
.end method

.method public add(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 29
    invoke-virtual {p0}, Lddk;->c()V

    .line 30
    invoke-super {p0, p1}, Ljava/util/AbstractList;->add(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public addAll(ILjava/util/Collection;)Z
    .locals 1

    .prologue
    .line 47
    invoke-virtual {p0}, Lddk;->c()V

    .line 48
    invoke-super {p0, p1, p2}, Ljava/util/AbstractList;->addAll(ILjava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 1

    .prologue
    .line 41
    invoke-virtual {p0}, Lddk;->c()V

    .line 42
    invoke-super {p0, p1}, Ljava/util/AbstractList;->addAll(Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 64
    const/4 v0, 0x0

    iput-boolean v0, p0, Lddk;->a:Z

    .line 65
    return-void
.end method

.method protected final c()V
    .locals 1

    .prologue
    .line 102
    iget-boolean v0, p0, Lddk;->a:Z

    if-nez v0, :cond_0

    .line 103
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0

    .line 105
    :cond_0
    return-void
.end method

.method public clear()V
    .locals 0

    .prologue
    .line 53
    invoke-virtual {p0}, Lddk;->c()V

    .line 54
    invoke-super {p0}, Ljava/util/AbstractList;->clear()V

    .line 55
    return-void
.end method

.method public remove(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 69
    invoke-virtual {p0}, Lddk;->c()V

    .line 70
    invoke-super {p0, p1}, Ljava/util/AbstractList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 75
    invoke-virtual {p0}, Lddk;->c()V

    .line 76
    invoke-super {p0, p1}, Ljava/util/AbstractList;->remove(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 1

    .prologue
    .line 81
    invoke-virtual {p0}, Lddk;->c()V

    .line 82
    invoke-super {p0, p1}, Ljava/util/AbstractList;->removeAll(Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 1

    .prologue
    .line 87
    invoke-virtual {p0}, Lddk;->c()V

    .line 88
    invoke-super {p0, p1}, Ljava/util/AbstractList;->retainAll(Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method public set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 93
    invoke-virtual {p0}, Lddk;->c()V

    .line 94
    invoke-super {p0, p1, p2}, Ljava/util/AbstractList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
