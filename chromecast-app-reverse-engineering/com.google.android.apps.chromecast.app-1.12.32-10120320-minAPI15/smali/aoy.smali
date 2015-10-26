.class final Laoy;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/util/Comparator;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 780
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .prologue
    .line 780
    check-cast p1, Laow;

    check-cast p2, Laow;

    .line 1783
    invoke-virtual {p1}, Laow;->g()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Laow;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    move-result v0

    .line 1784
    if-eqz v0, :cond_0

    .line 1788
    :goto_0
    return v0

    :cond_0
    invoke-virtual {p1}, Laow;->q()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, -0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    .line 780
    goto :goto_0
.end method
