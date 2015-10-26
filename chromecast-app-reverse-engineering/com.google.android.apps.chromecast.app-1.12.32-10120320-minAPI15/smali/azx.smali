.class final Lazx;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/util/Comparator;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 621
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .prologue
    .line 621
    check-cast p1, Landroid/net/wifi/WifiConfiguration;

    check-cast p2, Landroid/net/wifi/WifiConfiguration;

    .line 1625
    iget v0, p1, Landroid/net/wifi/WifiConfiguration;->priority:I

    iget v1, p2, Landroid/net/wifi/WifiConfiguration;->priority:I

    sub-int/2addr v0, v1

    .line 621
    return v0
.end method
