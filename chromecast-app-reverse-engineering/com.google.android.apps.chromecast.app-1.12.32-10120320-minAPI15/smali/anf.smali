.class public final Lanf;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbdn;


# instance fields
.field private synthetic a:Lbdm;

.field private synthetic b:Laop;

.field private synthetic c:Land;


# direct methods
.method public constructor <init>(Land;Lbdm;Laop;)V
    .locals 0

    .prologue
    .line 579
    iput-object p1, p0, Lanf;->c:Land;

    iput-object p2, p0, Lanf;->a:Lbdm;

    iput-object p3, p0, Lanf;->b:Laop;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 579
    check-cast p1, Lbdf;

    .line 1743
    iget-object v0, p1, Lbdf;->U:Lbcv;

    .line 1583
    if-eqz v0, :cond_0

    .line 1584
    iget-object v0, p0, Lanf;->c:Land;

    invoke-static {v0}, Land;->a(Land;)Lbdf;

    move-result-object v0

    .line 2743
    iget-object v1, p1, Lbdf;->U:Lbcv;

    .line 3736
    iput-object v1, v0, Lbdf;->U:Lbcv;

    .line 1585
    iget-object v0, p0, Lanf;->c:Land;

    invoke-static {v0}, Land;->a(Land;)Lbdf;

    move-result-object v0

    .line 3754
    iget-object v1, p1, Lbdf;->V:[Ljava/lang/String;

    .line 4747
    iput-object v1, v0, Lbdf;->V:[Ljava/lang/String;

    .line 1589
    :cond_0
    iget-object v0, p0, Lanf;->c:Land;

    iget-object v1, p0, Lanf;->a:Lbdm;

    const/4 v2, 0x0

    iget-object v3, p0, Lanf;->b:Laop;

    invoke-virtual {v0, v1, v2, v3}, Land;->a(Lbdm;Ljava/lang/String;Laop;)V

    .line 579
    return-void
.end method

.method public final b_(I)V
    .locals 6

    .prologue
    .line 594
    iget-object v0, p0, Lanf;->c:Land;

    const-string v2, "Could not get certificates from device"

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget-object v5, p0, Lanf;->b:Laop;

    move v1, p1

    invoke-virtual/range {v0 .. v5}, Land;->a(ILjava/lang/String;Lapd;ZLaoo;)V

    .line 596
    return-void
.end method
