.class final Ldeh;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field private final a:Ljava/util/Stack;

.field private b:Lddy;


# direct methods
.method constructor <init>(Lddl;)V
    .locals 1

    .prologue
    .line 694
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 690
    new-instance v0, Ljava/util/Stack;

    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    iput-object v0, p0, Ldeh;->a:Ljava/util/Stack;

    .line 695
    invoke-direct {p0, p1}, Ldeh;->a(Lddl;)Lddy;

    move-result-object v0

    iput-object v0, p0, Ldeh;->b:Lddy;

    .line 696
    return-void
.end method

.method private a(Lddl;)Lddy;
    .locals 2

    .prologue
    .line 699
    move-object v0, p1

    .line 700
    :goto_0
    instance-of v1, v0, Ldeg;

    if-eqz v1, :cond_0

    .line 701
    check-cast v0, Ldeg;

    .line 702
    iget-object v1, p0, Ldeh;->a:Ljava/util/Stack;

    invoke-virtual {v1, v0}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 703
    invoke-static {v0}, Ldeg;->a(Ldeg;)Lddl;

    move-result-object v0

    goto :goto_0

    .line 705
    :cond_0
    check-cast v0, Lddy;

    return-object v0
.end method

.method private b()Lddy;
    .locals 2

    .prologue
    .line 712
    :cond_0
    iget-object v0, p0, Ldeh;->a:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 713
    const/4 v0, 0x0

    .line 717
    :goto_0
    return-object v0

    .line 715
    :cond_1
    iget-object v0, p0, Ldeh;->a:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldeg;

    invoke-static {v0}, Ldeg;->b(Ldeg;)Lddl;

    move-result-object v0

    invoke-direct {p0, v0}, Ldeh;->a(Lddl;)Lddy;

    move-result-object v0

    .line 1110
    invoke-virtual {v0}, Lddl;->b()I

    move-result v1

    if-nez v1, :cond_2

    const/4 v1, 0x1

    .line 716
    :goto_1
    if-nez v1, :cond_0

    goto :goto_0

    .line 1110
    :cond_2
    const/4 v1, 0x0

    goto :goto_1
.end method


# virtual methods
.method public final a()Lddy;
    .locals 2

    .prologue
    .line 733
    iget-object v0, p0, Ldeh;->b:Lddy;

    if-nez v0, :cond_0

    .line 734
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    .line 736
    :cond_0
    iget-object v0, p0, Ldeh;->b:Lddy;

    .line 737
    invoke-direct {p0}, Ldeh;->b()Lddy;

    move-result-object v1

    iput-object v1, p0, Ldeh;->b:Lddy;

    .line 738
    return-object v0
.end method

.method public final hasNext()Z
    .locals 1

    .prologue
    .line 724
    iget-object v0, p0, Ldeh;->b:Lddy;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final synthetic next()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 688
    invoke-virtual {p0}, Ldeh;->a()Lddy;

    move-result-object v0

    return-object v0
.end method

.method public final remove()V
    .locals 1

    .prologue
    .line 742
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
