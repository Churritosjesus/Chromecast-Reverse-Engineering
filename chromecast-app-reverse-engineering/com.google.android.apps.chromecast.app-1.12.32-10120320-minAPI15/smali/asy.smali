.class final Lasy;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lme;


# instance fields
.field private synthetic a:Lasx;


# direct methods
.method constructor <init>(Lasx;)V
    .locals 0

    .prologue
    .line 145
    iput-object p1, p0, Lasy;->a:Lasx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 149
    iget-object v0, p0, Lasy;->a:Lasx;

    iget-object v1, p0, Lasy;->a:Lasx;

    invoke-static {v1}, Lasx;->a(Lasx;)I

    move-result v1

    invoke-static {v0, v1}, Lasx;->a(Lasx;I)V

    .line 150
    return-void
.end method
