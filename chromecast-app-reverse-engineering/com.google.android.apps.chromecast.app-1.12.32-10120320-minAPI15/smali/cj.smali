.class final Lcj;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 548
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 548
    .line 2551
    new-instance v0, Lci;

    .line 3033
    invoke-direct {v0, p1}, Lci;-><init>(Landroid/os/Parcel;)V

    .line 548
    return-object v0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 548
    .line 1556
    new-array v0, p1, [Lci;

    .line 548
    return-object v0
.end method
