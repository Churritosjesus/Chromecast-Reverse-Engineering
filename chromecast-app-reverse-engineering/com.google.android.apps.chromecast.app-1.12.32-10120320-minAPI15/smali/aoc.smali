.class public final Laoc;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbdn;


# instance fields
.field private synthetic a:Laop;

.field private synthetic b:Land;


# direct methods
.method public constructor <init>(Land;Laop;)V
    .locals 0

    .prologue
    .line 384
    iput-object p1, p0, Laoc;->b:Land;

    iput-object p2, p0, Laoc;->a:Laop;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 384
    .line 1388
    iget-object v0, p0, Laoc;->a:Laop;

    invoke-interface {v0}, Laop;->a()V

    .line 384
    return-void
.end method

.method public final b_(I)V
    .locals 6

    .prologue
    .line 393
    iget-object v0, p0, Laoc;->b:Land;

    const-string v2, "Could not play sound"

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget-object v5, p0, Laoc;->a:Laop;

    move v1, p1

    invoke-virtual/range {v0 .. v5}, Land;->a(ILjava/lang/String;Lapd;ZLaoo;)V

    .line 394
    return-void
.end method
