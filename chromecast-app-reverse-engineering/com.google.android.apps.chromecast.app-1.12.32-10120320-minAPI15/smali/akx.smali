.class public final Lakx;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lail;


# instance fields
.field private synthetic a:Laku;


# direct methods
.method public constructor <init>(Laku;)V
    .locals 0

    .prologue
    .line 364
    iput-object p1, p0, Lakx;->a:Laku;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(ILandroid/content/Intent;)Z
    .locals 2

    .prologue
    .line 367
    iget-object v0, p0, Lakx;->a:Laku;

    .line 1149
    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, v1}, Laku;->a(ILandroid/content/Intent;Lafo;)Z

    move-result v0

    .line 367
    return v0
.end method
