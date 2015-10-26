.class public final Lakv;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lail;


# instance fields
.field private synthetic a:Lafo;

.field private synthetic b:Laku;


# direct methods
.method public constructor <init>(Laku;Lafo;)V
    .locals 0

    .prologue
    .line 136
    iput-object p1, p0, Lakv;->b:Laku;

    iput-object p2, p0, Lakv;->a:Lafo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(ILandroid/content/Intent;)Z
    .locals 2

    .prologue
    .line 139
    iget-object v0, p0, Lakv;->b:Laku;

    iget-object v1, p0, Lakv;->a:Lafo;

    invoke-virtual {v0, p1, p2, v1}, Laku;->a(ILandroid/content/Intent;Lafo;)Z

    move-result v0

    return v0
.end method
