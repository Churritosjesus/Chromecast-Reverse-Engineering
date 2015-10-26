.class final Lbhc;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbaa;


# instance fields
.field private synthetic a:Lbhb;


# direct methods
.method constructor <init>(Lbhb;)V
    .locals 0

    .prologue
    .line 108
    iput-object p1, p0, Lbhc;->a:Lbhb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private b()V
    .locals 5

    .prologue
    .line 123
    iget-object v0, p0, Lbhc;->a:Lbhb;

    iget-object v0, v0, Lbhb;->a:Lbha;

    invoke-static {v0}, Lbha;->b(Lbha;)Lazv;

    move-result-object v0

    iget-object v1, p0, Lbhc;->a:Lbhb;

    iget-object v1, v1, Lbhb;->a:Lbha;

    invoke-static {v1}, Lbha;->c(Lbha;)Ljava/lang/String;

    move-result-object v1

    .line 1222
    invoke-virtual {v0, v1}, Lazv;->a(Ljava/lang/String;)Landroid/net/wifi/WifiConfiguration;

    move-result-object v2

    .line 1223
    if-eqz v2, :cond_0

    .line 1224
    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    .line 1225
    iget-object v0, v0, Lazv;->c:Landroid/net/wifi/WifiManager;

    iget v1, v2, Landroid/net/wifi/WifiConfiguration;->networkId:I

    invoke-virtual {v0, v1}, Landroid/net/wifi/WifiManager;->removeNetwork(I)Z

    .line 124
    :cond_0
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    .prologue
    .line 112
    invoke-direct {p0}, Lbhc;->b()V

    .line 113
    return-void
.end method

.method public final a(Z)V
    .locals 0

    .prologue
    .line 117
    invoke-direct {p0}, Lbhc;->b()V

    .line 118
    return-void
.end method
