.class final Lazw;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbaa;


# instance fields
.field private synthetic a:Lbaa;

.field private synthetic b:Lazv;


# direct methods
.method constructor <init>(Lazv;Lbaa;)V
    .locals 0

    .prologue
    .line 181
    iput-object p1, p0, Lazw;->b:Lazv;

    iput-object p2, p0, Lazw;->a:Lbaa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 185
    iget-object v0, p0, Lazw;->b:Lazv;

    .line 1036
    const/4 v1, 0x0

    iput-object v1, v0, Lazv;->f:Lbab;

    .line 186
    iget-object v0, p0, Lazw;->a:Lbaa;

    invoke-interface {v0}, Lbaa;->a()V

    .line 187
    return-void
.end method

.method public final a(Z)V
    .locals 2

    .prologue
    .line 191
    iget-object v0, p0, Lazw;->b:Lazv;

    .line 2036
    const/4 v1, 0x0

    iput-object v1, v0, Lazv;->f:Lbab;

    .line 192
    iget-object v0, p0, Lazw;->a:Lbaa;

    invoke-interface {v0, p1}, Lbaa;->a(Z)V

    .line 193
    return-void
.end method
