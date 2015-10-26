.class final Lbco;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/util/Comparator;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .prologue
    .line 63
    check-cast p1, Lbcd;

    check-cast p2, Lbcd;

    .line 1108
    iget-object v0, p1, Lbcd;->a:Ldbk;

    .line 1066
    if-eqz v0, :cond_0

    .line 2108
    iget-object v0, p1, Lbcd;->a:Ldbk;

    .line 1066
    iget-object v0, v0, Ldbk;->d:Ljava/lang/Integer;

    if-nez v0, :cond_1

    .line 1067
    :cond_0
    const/4 v0, -0x1

    .line 1070
    :goto_0
    return v0

    .line 3108
    :cond_1
    iget-object v0, p2, Lbcd;->a:Ldbk;

    .line 1069
    if-eqz v0, :cond_2

    .line 4108
    iget-object v0, p2, Lbcd;->a:Ldbk;

    .line 1069
    iget-object v0, v0, Ldbk;->d:Ljava/lang/Integer;

    if-nez v0, :cond_3

    .line 1070
    :cond_2
    const/4 v0, 0x1

    goto :goto_0

    .line 5108
    :cond_3
    iget-object v0, p2, Lbcd;->a:Ldbk;

    .line 1072
    iget-object v0, v0, Ldbk;->d:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 6108
    iget-object v1, p1, Lbcd;->a:Ldbk;

    .line 1073
    iget-object v1, v1, Ldbk;->d:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 1072
    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    goto :goto_0
.end method
